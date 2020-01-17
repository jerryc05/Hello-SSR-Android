package io.jerryc05.hello_ssr.aidl;

interface IShadowsocksServiceCallback {
  oneway void stateChanged(int state, String profileName, String msg);
  oneway void trafficUpdated(long txRate, long rxRate, long txTotal, long rxTotal);
}
