package com.femaledaily.app.data.http;



import java.util.List;

import com.femaledaily.app.model.ResponseModel;
import com.femaledaily.app.model.SVRAppserviceLandingPagesListLandingPageItemReturnEntity;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/11/16.
 */

public interface ProductApi {

    @GET("appservice/landingPages/list")
    Observable<ResponseModel<List<SVRAppserviceLandingPagesListLandingPageItemReturnEntity>>> getLandingPages(@Query("category_id") String id);

}
