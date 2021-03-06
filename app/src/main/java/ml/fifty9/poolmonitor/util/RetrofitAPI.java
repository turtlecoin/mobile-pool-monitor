package ml.fifty9.poolmonitor.util;

import ml.fifty9.poolmonitor.model.statsaddress.Pool;
import ml.fifty9.poolmonitor.model.pool.StatExample;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by HemantJ on 07/02/18.
 */

public interface RetrofitAPI {

    @GET("stats_address")
    Call<Pool> queryDashboardStats(@Query("address") String address);

    @GET("stats")
    Call<StatExample> queryStats();
}
