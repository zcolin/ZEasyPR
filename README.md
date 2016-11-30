# EasyprDemo
##车牌识别库，基于EasyPR_Android： https://github.com/linuxxx/EasyPR_Android, so库编译时间为 2016-09-01。对拍摄图片采取多次采样，然后对比选出最佳值，结果更加准确。

###complie方式引用本库可以使用：
####在根目录的build.gradle中加入

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
####在App中的gradle中加入
  
  dependencies {
	        compile 'com.github.zcolin:zcolin_EasyPRLib:1.0.5'
	}
