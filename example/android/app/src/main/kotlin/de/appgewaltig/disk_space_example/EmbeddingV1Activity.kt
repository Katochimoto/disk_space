package rikishi.disk_space_ng_example

import android.os.Bundle
import rikishi.disk_space_ng.DiskSpaceNgPlugin
import io.flutter.app.FlutterActivity


class EmbeddingV1Activity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DiskSpaceNgPlugin.registerWith(registrarFor("rikishi.disk_space_ng.DiskSpaceNgPlugin"))
    }
}