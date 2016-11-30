# EasyprDemo
##车牌识别库，基于EasyPR_Android： https://github.com/linuxxx/EasyPR_Android, so库编译时间为 2016-09-01。对拍摄图片采取多次采样，然后对比选出最佳值，结果更加准确。

#因为此库之编译除了v7a的库，所以必须在引用的项目的gradle加入此句，防止有其他的引用library使用了更高级的如V8等造成车牌识别库当掉的问题

  ndk {
            abiFilters  "armeabi-v7a"  // 指定要ndk需要兼容的架构(这样其他依赖包里mips,x86,armeabi,arm-v8之类的so会被过滤掉)
        }
