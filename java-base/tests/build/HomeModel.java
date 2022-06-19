public class HomeModel extends AppModel{

  public String[] menu = new String[3];

  public String debug = "TRUE";

  HomeModel(AppData data){

    this.data = data;

    setMenu();

    data.getDataArray("left","sidebar");

    data.readDataArray("sidebar");

    data.setData("product-image","images/home/ipad_panel_beats.jpg");

    data.setData("title","E-Shop");

  }

  public AppProperties[] createProps() {

    // Add number elements to matchDataProperties in AppData.java

    AppProperties[] props = new AppProperties[data.AppPropertiesTotal];

    props[0] = new AppProperties();

    props[1] = new AppProperties();

    props[2] = new AppProperties();

    props[3] = new AppProperties();

    props[0].set("icon","images/home/ipad_button_default.jpg");

    props[1].set("rollover","images/home/default_rollover.jpg");

    props[2].setNumber("imgWidth",232);

    props[3].setNumber("imgHeight",70);

    return props;
  }

  public void setMenu(){

    data.setDataProperties("left","Nike",createProps());

    data.setDataProperties("left","Football",createProps());

    data.setDataProperties("left","Trail",createProps());

    data.setDataProperties("left","Sprint",createProps());

    data.setDataProperties("left","Rugby",createProps());

    data.setDataProperties("left","Golf",createProps());

    data.setDataProperties("left","Tennis",createProps());

    data.setDataProperties("left","Squash",createProps());

    data.setDataProperties("left","BMX",createProps());

    data.setDataProperties("left","GYM",createProps());

    data.setDataProperties("left","Hybrid",createProps());

  }

}
