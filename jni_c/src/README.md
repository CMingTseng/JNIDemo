C/C++代码放在其他目录，需要设置Application.mk，新建Android.mk设置属性，然后使用以下指令, 即可生成so库

```
ndk-build NDK_PROJECT_PATH={工程目录} NDK_APPLICATION_MK={工程的Applicaion.mk目录}
```