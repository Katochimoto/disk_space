#import "DiskSpaceNgPlugin.h"
#import <disk_space_ng/disk_space_ng-Swift.h>

@implementation DiskSpaceNgPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftDiskSpaceNgPlugin registerWithRegistrar:registrar];
}
@end
