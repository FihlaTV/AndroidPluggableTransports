package info.pluggabletransports.dispatch.transports;

import android.content.Context;

import java.net.InetAddress;
import java.util.Properties;

import info.pluggabletransports.dispatch.Connection;
import info.pluggabletransports.dispatch.Listener;
import info.pluggabletransports.dispatch.Transport;

public class Obfs4Transport implements Transport {

    @Override
    public void init(Context context, Properties options) {

    }

    @Override
    public Connection connect(String addr) {
        return null;
    }

    @Override
    public Listener listen(String addr) {
        return null;
    }
}
