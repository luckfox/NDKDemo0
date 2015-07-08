#include <com_cotrust_myapplication_MainActivity.h>
#include "jni.h"

JNIEXPORT jstring JNICALL Java_com_cotrust_myapplication_MainActivity_getStringFromNative(JNIEnv *env, jobject obj)
{
    return (*env)->NewStringUTF(env,"Hello NKD demo");
}
