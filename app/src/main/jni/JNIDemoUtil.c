#include <stdlib.h>
#include <jni.h>
#include "com_kyo_jnidemo_jni_JNIDemoUtil.h"

#ifdef __cplusplus
extern "C" {
#endif

jstring Java_com_kyo_jnidemo_jni_JNIDemoUtil_getString(JNIEnv *env, jclass obj, jstring input) {
    return (*env)->NewStringUTF(env, "hello world");
}

#ifdef __cplusplus
}
#endif