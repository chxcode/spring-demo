package top.changxuan.domain;

/**
 * @ClassName Message
 * @Description
 * @Author changxuan
 * @Date 2021/4/13 下午12:40
 **/
public class Message {

    private Long id;

    private String msg;

    public Message(Long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
