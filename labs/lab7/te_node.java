public class te_node{
   public Tag tag;
   public int size;
   public BaseCode code;
   
   private te_node left, right;
   
   public static te_node te_make_base(BaseCode code){
      te_node node = new te_node();
      node.tag = Tag.BASE;
      node.code = code;
      return node;
   }
   
   public static te_node te_make_pointer(te_node base){
      te_node node = new te_node();
      node.tag = Tag.POINTER;
      node.left = base;
      return node;
   }
   
   public static te_node te_make_array(int size, te_node base){
      te_node node = new te_node();
      node.tag = Tag.ARRAY;
      node.size = size;
      node.left = base;
      return node;
   }
   
   public String toString(){
      switch(this.tag){
         case BASE:
            return getString(this.code);
         case ARRAY:
            return "array("+this.size+", "+this.left.toString()+")";
         case POINTER:
            return "pointer("+this.left.toString()+")";
         default:
            return null;
      }
   }
   
   public static String getString(BaseCode code){
      switch(code){
         case INT:      return "[INT]";
         case FLOAT:    return "[FLOAT]";
         case DOUBLE:   return "[DOUBLE]";
         case CHAR:     return "[CHAR]";
         default:       return null;
      }
   }
}
