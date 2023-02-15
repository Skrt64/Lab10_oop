public interface Handler {
    public void setHandler(Handler nextHandler);
    //method สำหรับกำหนด h
    //
    //
    public void process(File file);
    public String getName();
}
