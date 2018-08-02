package io.bumo.model.request;

/**
 * @Author riven
 * @Date 2018/7/4 14:54
 */
public class AccountGetNonceRequest {
    private String address;

    /**
     * @Author riven
     * @Method getAddress
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/4 15:13
     */
    public String getAddress() {
        return address;
    }

    /**
     * @Author riven
     * @Method setAddress
     * @Params [address]
     * @Return void
     * @Date 2018/7/4 15:12
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
