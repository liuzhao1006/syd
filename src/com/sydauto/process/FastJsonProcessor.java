package com.sydauto.process;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElementFactory;
import com.sydauto.entity.ClassEntity;

/**
 * @author  刘朝
 * @since  2019/9/20
 */
public class FastJsonProcessor

        extends Processor {

    @Override
    public void onStarProcess(ClassEntity classEntity, PsiElementFactory factory, PsiClass cls, IProcessor visitor) {
        super.onEndProcess(classEntity, factory, cls, visitor);
    }
}
