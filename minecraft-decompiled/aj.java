import java.util.List;

public record aj(ame c, ai d) {
   public static final zm<wx, aj> a = zm.a(ame.b, aj::a, ai.b, aj::b, aj::new);
   public static final zm<wx, List<aj>> b = a.a(zk.a());

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof aj $$1 && this.c.equals($$1.c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public String toString() {
      return this.c.toString();
   }

   public ame a() {
      return this.c;
   }

   public ai b() {
      return this.d;
   }
}
