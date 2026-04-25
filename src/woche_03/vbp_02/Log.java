package woche_03.vbp_02;

public class Log {
    private int priority;
    private String lastMessage;

    public Log setPriority(int prio){
        this.priority = prio;
        return this;
    }

    public Log log(String module, String message) {
        this.lastMessage = "[" + this.priority + "] <" + module + ">: " + message;
        return this;
    }

    public Log log(String message) {
        return log("System", message);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
