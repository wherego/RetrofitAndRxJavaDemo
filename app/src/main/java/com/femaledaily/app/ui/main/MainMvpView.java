package com.femaledaily.app.ui.main;

import com.femaledaily.app.model.UserInfoModel;
import com.femaledaily.app.ui.base.BaseView;

/**
 * Created by Administrator on 2016/12/23.
 */

public interface MainMvpView  extends BaseView{
    public  void showErrorMsg(String errorMsg);

    public void startHomePage();


    public void showProgressDialog();

    public void dimssProgressDialog();

    public void  setUserInfoView(UserInfoModel userInfo);
}
