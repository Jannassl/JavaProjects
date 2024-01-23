public class Television {
    private boolean status;
    private int channel;

    // setChannel, getChannel, isOn, pressOnOff,

    public Television(){
        status = true;
        channel = 0;

    }
    boolean isOn (){
        if(status != true){
            status = false;
        }
        return status;
    }
    int getChannel(){
        int currentChannel = channel;
        return currentChannel;
    }
    int setChannel(int num){
        channel = num;
        if(channel>= 10){
            channel -= 9;

        }
        return channel;
    }
    boolean pressOnOff(){
        if(status){
            status = false;
        }
        else {
            status = true;
        }
        return status;
    }
}
