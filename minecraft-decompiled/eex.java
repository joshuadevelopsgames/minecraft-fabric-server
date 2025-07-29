public enum eex implements bda {
   a(jh.a),
   b(jh.b);

   private final jh c;

   private eex(final jh $$0) {
      this.c = $$0;
   }

   public jh a() {
      return this.c;
   }

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "upper" : "lower";
   }

   public eex b() {
      return this == a ? b : a;
   }
}
