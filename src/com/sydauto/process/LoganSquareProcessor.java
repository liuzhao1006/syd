package com.sydauto.process;

import com.intellij.psi.*;
import com.sydauto.entity.ClassEntity;

import java.util.regex.Pattern;

/**
 * @author 刘朝
 * @since 2019/9/20
 */
public class LoganSquareProcessor extends Processor {
    @Override
    protected void onStarProcess(ClassEntity classEntity, PsiElementFactory factory, PsiClass cls, IProcessor visitor) {
        super.onStarProcess(classEntity, factory, cls, visitor);
        injectAnnotation(factory, cls);
    }

    @Override
    protected void onEndGenerateClass(PsiElementFactory factory, ClassEntity classEntity, PsiClass parentClass, PsiClass generateClass, IProcessor visitor) {
        super.onEndGenerateClass(factory, classEntity, parentClass, generateClass, visitor);
        injectAnnotation(factory, generateClass);
    }

    private void injectAnnotation(PsiElementFactory factory, PsiClass generateClass) {
        if (factory == null || generateClass == null) {
            return;
        }
        PsiModifierList modifierList = generateClass.getModifierList();
        if (modifierList != null) {
            PsiElement firstChild = modifierList.getFirstChild();
            Pattern pattern = Pattern.compile("@.*?JsonObject");
            if (firstChild != null && !pattern.matcher(firstChild.getText()).find()) {
                PsiAnnotation annotationFromText = factory.createAnnotationFromText("@com.bluelinelabs.logansquare.annotation.JsonObject", generateClass);
                modifierList.addBefore(annotationFromText, firstChild);
            }
        }
    }
}

