import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList; 
import java.util.Iterator;

public class JenkinsMapsSample {

   Map m;
   
   public JenkinsMapsSample(){
    m = new HashMap();
   }
   
   publi void initMap(){
    m.put("one",1);
    m.put("two",2);
    m.put("three",3);
    m.put("four",4);
    m.put("five",5);
   }
   
   public int countItems(){
    return m.size();
   }
   
   public List getItems(List keyList){
     Iterator it = null;
     List results = new ArrayList();
     if (keyList != null)
      it = keyList.iterator();
     else
      return new ArrayList();
    
     String item = "";
     while(it.hasNext()){
      item = (String)it.next();
      results.add(  Integer.parseInt( (m.get(item)!=null) ? item : "0" )  );
     }
     return results;
   }
}
