package rikishi.disk_space_ng

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.PluginRegistry

class DiskSpaceNgPlugin: FlutterPlugin {

  companion object {
    private var channel: MethodChannel? = null
    private var handler: MethodHandlerImpl = MethodHandlerImpl()

    @JvmStatic
    fun registerWith(registrar: PluginRegistry.Registrar) {
      registerChannel(registrar.messenger())
    }

    private fun registerChannel(messenger: BinaryMessenger) {
      channel = MethodChannel(messenger, "disk_space_ng")
      channel!!.setMethodCallHandler(handler)
    }
  }

  override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    registerChannel(binding.binaryMessenger)
  }

  override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
    channel = null
  }
}