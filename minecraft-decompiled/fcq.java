public class fcq {
   public static final fcq a = new fcq("advancements");
   public static final fcq b = new fcq("stats");
   public static final fcq c = new fcq("playerdata");
   public static final fcq d = new fcq("players");
   public static final fcq e = new fcq("level.dat");
   public static final fcq f = new fcq("level.dat_old");
   public static final fcq g = new fcq("icon.png");
   public static final fcq h = new fcq("session.lock");
   public static final fcq i = new fcq("generated");
   public static final fcq j = new fcq("datapacks");
   public static final fcq k = new fcq("resources.zip");
   public static final fcq l = new fcq(".");
   private final String m;

   private fcq(String $$0) {
      this.m = $$0;
   }

   public String a() {
      return this.m;
   }

   @Override
   public String toString() {
      return "/" + this.m;
   }
}
