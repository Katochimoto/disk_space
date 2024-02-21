import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:disk_space_ng/disk_space_ng.dart';

void main() {
  const MethodChannel channel = MethodChannel('disk_space_ng');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await DiskSpaceNg.platformVersion, '42');
  });
}
