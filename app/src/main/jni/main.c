//
// Created by MIB on 2016/5/29/0029.
//
#include "com_example_ndkplus_MainActivity.h"

JNIEXPORT jfloat JNICALL Java_com_example_ndkplus_MainActivity_add
        (JNIEnv * env, jobject obj, jfloat num1, jfloat num2){
    return num1 + num2;
}