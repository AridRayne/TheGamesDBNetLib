package net.thegamesdb.lib;
import java.util.ArrayList;


public class PlatformImages {
	ArrayList<String> _mFanartURLs;
	ArrayList<String> _mBoxartURLs;
	ArrayList<String> _mBannerURLs;
	String _mConsoleURL;
	String _mControllerURL;
	
	public ArrayList<String> get_FanartURLs() {
		return _mFanartURLs;
	}
	public void set_FanartURLs(ArrayList<String> FanartURLs) {
		this._mFanartURLs = FanartURLs;
	}
	public ArrayList<String> get_BoxartURLs() {
		return _mBoxartURLs;
	}
	public void set_BoxartURLs(ArrayList<String> BoxartURLs) {
		this._mBoxartURLs = BoxartURLs;
	}
	public ArrayList<String> get_BannerURLs() {
		return _mBannerURLs;
	}
	public void set_BannerURLs(ArrayList<String> BannerURLs) {
		this._mBannerURLs = BannerURLs;
	}
	public String get_ConsoleURL() {
		return _mConsoleURL;
	}
	public void set_ConsoleURL(String ConsoleURL) {
		this._mConsoleURL = ConsoleURL;
	}
	public String get_ControllerURL() {
		return _mControllerURL;
	}
	public void set_ControllerURL(String ControllerURL) {
		this._mControllerURL = ControllerURL;
	}
	
}
