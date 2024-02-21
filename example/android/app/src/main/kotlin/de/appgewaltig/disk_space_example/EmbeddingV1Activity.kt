package rikishi.disk_space_example

import android.os.Bundle
import rikishi.disk_space.DiskSpacePlugin
import io.flutter.app.FlutterActivity


class EmbeddingV1Activity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DiskSpacePlugin.registerWith(registrarFor("rikishi.disk_space.DiskSpacePlugin"))
    }
}