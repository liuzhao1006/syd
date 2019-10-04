package com.sydauto.process;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElementFactory;
import com.sydauto.entity.ClassEntity;

/**
 * @author  刘朝
 * @since  2019/9/20
 */
public interface IProcessor {
    void onStarProcess(ClassEntity classEntity, PsiElementFactory factory, PsiClass cls);

    void onEndProcess(ClassEntity classEntity, PsiElementFactory factory, PsiClass cls);

    void onStartGenerateClass(PsiElementFactory factory, ClassEntity classEntity, PsiClass parentClass);

    void onEndGenerateClass(PsiElementFactory factory, ClassEntity classEntity, PsiClass parentClass, PsiClass generateClass);

}
