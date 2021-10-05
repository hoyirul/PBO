public class Orang{
    private String jk;
    private int umur;
    private String address;

    public Orang(String jk, int umur, String address){
        this.jk = jk;
        this.umur = umur;
        this.address = address;
    }

    public void setJk(String jk){
        this.jk = jk;
    }

    public String getJk(){
        return jk;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public int getUmur(){
        return umur;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public String info() {
        String info = "";
        info += "JK     : " + getJk() + "\n";
        info += "Umur   : " + getUmur() + "\n";
        info += "Alamat : " + getAddress() + "";
        return info;
    }
}