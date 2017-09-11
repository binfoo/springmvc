package org.binfoo;

/**
 * Created by binfoo on 2017/9/9.
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}