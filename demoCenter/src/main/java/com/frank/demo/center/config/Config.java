package com.frank.demo.center.config;

public class Config {
    private String dataSourceUrl;
    private String dataUserName;
    private String dataPassword;

    private String redisHost;
    private int redisPort;
    private String redisPassword;
    private int redisDbIndex;

    /**
     * 客户端超时时间单位是毫秒
     */
    private int redisTimeout;
    /**
     * 最大空闲数
     */
    private int redisMaxIdle;
    /**
     * 连接池的最大数据库连接数。设为0表示无限制
     */
    private int redisMaxTotal;
    /**
     *
     最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。
     */
     private int redisMaxWaitMillis;
    /**
     *连接的最小空闲时间 默认1800000毫秒(30分钟)
     */
    private int redisMinEvictableIdleTimeMillis;
    /**
     每次释放连接的最大数目,默认3
     */
    private int redisNumTestsPerEvictionRun;
    /**
     逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
     *
     */
    private int redisTimeBetweenEvictionRunsMillis;
    /**
     是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
     *
     */
    private boolean redisTestOnBorrow;
    /**
     在空闲时检查有效性, 默认false
     *
     */
    private boolean redisTestWhileIdle;




    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public void setDataSourceUrl(String dataSourceUrl) {
        this.dataSourceUrl = dataSourceUrl;
    }

    public String getDataUserName() {
        return dataUserName;
    }

    public void setDataUserName(String dataUserName) {
        this.dataUserName = dataUserName;
    }

    public String getDataPassword() {
        return dataPassword;
    }

    public void setDataPassword(String dataPassword) {
        this.dataPassword = dataPassword;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public int getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }

    public String getRedisPassword() {
        return redisPassword;
    }

    public void setRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
    }

    public int getRedisDbIndex() {
        return redisDbIndex;
    }

    public void setRedisDbIndex(int redisDbIndex) {
        this.redisDbIndex = redisDbIndex;
    }

    public int getRedisTimeout() {
        return redisTimeout;
    }

    public void setRedisTimeout(int redisTimeout) {
        this.redisTimeout = redisTimeout;
    }

    public int getRedisMaxIdle() {
        return redisMaxIdle;
    }

    public void setRedisMaxIdle(int redisMaxIdle) {
        this.redisMaxIdle = redisMaxIdle;
    }

    public int getRedisMaxTotal() {
        return redisMaxTotal;
    }

    public void setRedisMaxTotal(int redisMaxTotal) {
        this.redisMaxTotal = redisMaxTotal;
    }

    public int getRedisMaxWaitMillis() {
        return redisMaxWaitMillis;
    }

    public void setRedisMaxWaitMillis(int redisMaxWaitMillis) {
        this.redisMaxWaitMillis = redisMaxWaitMillis;
    }

    public int getRedisMinEvictableIdleTimeMillis() {
        return redisMinEvictableIdleTimeMillis;
    }

    public void setRedisMinEvictableIdleTimeMillis(int redisMinEvictableIdleTimeMillis) {
        this.redisMinEvictableIdleTimeMillis = redisMinEvictableIdleTimeMillis;
    }

    public int getRedisNumTestsPerEvictionRun() {
        return redisNumTestsPerEvictionRun;
    }

    public void setRedisNumTestsPerEvictionRun(int redisNumTestsPerEvictionRun) {
        this.redisNumTestsPerEvictionRun = redisNumTestsPerEvictionRun;
    }

    public int getRedisTimeBetweenEvictionRunsMillis() {
        return redisTimeBetweenEvictionRunsMillis;
    }

    public void setRedisTimeBetweenEvictionRunsMillis(int redisTimeBetweenEvictionRunsMillis) {
        this.redisTimeBetweenEvictionRunsMillis = redisTimeBetweenEvictionRunsMillis;
    }

    public boolean getRedisTestOnBorrow() {
        return redisTestOnBorrow;
    }

    public void setRedisTestOnBorrow(boolean redisTestOnBorrow) {
        this.redisTestOnBorrow = redisTestOnBorrow;
    }

    public boolean getRedisTestWhileIdle() {
        return redisTestWhileIdle;
    }

    public void setRedisTestWhileIdle(boolean redisTestWhileIdle) {
        this.redisTestWhileIdle = redisTestWhileIdle;
    }
}
