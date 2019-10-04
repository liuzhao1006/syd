package com.sydauto.support.ux;

/**
 * @author 刘朝
 * @since 2019/9/20
 */
public interface CellProvider {

    String getCellTitle(int index);

    void setValueAt(int column, String text);
}
