import com.mojang.serialization.Codec;

public class ecd extends eaz {
   public static final Codec<amd<ewi>> a = amd.a(mn.bk);
   public static final ame b = ame.b("empty");
   private static final int k = 0;
   private static final int l = 0;
   public static final String c = "target";
   public static final String d = "pool";
   public static final String e = "joint";
   public static final String f = "placement_priority";
   public static final String g = "selection_priority";
   public static final String h = "name";
   public static final String i = "final_state";
   public static final String j = "minecraft:air";
   private ame m = b;
   private ame q = b;
   private amd<ewi> r = qx.a;
   private ecd.a s = ecd.a.a;
   private String t = "minecraft:air";
   private int u = 0;
   private int v = 0;

   public ecd(jb $$0, eeb $$1) {
      super(ebb.G, $$0, $$1);
   }

   public ame a() {
      return this.m;
   }

   public ame c() {
      return this.q;
   }

   public amd<ewi> d() {
      return this.r;
   }

   public String f() {
      return this.t;
   }

   public ecd.a j() {
      return this.s;
   }

   public int k() {
      return this.u;
   }

   public int u() {
      return this.v;
   }

   public void a(ame $$0) {
      this.m = $$0;
   }

   public void b(ame $$0) {
      this.q = $$0;
   }

   public void a(amd<ewi> $$0) {
      this.r = $$0;
   }

   public void a(String $$0) {
      this.t = $$0;
   }

   public void a(ecd.a $$0) {
      this.s = $$0;
   }

   public void a(int $$0) {
      this.u = $$0;
   }

   public void b(int $$0) {
      this.v = $$0;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("name", ame.a, this.m);
      $$0.a("target", ame.a, this.q);
      $$0.a("pool", a, this.r);
      $$0.a("final_state", this.t);
      $$0.a("joint", ecd.a.c, this.s);
      $$0.a("placement_priority", this.u);
      $$0.a("selection_priority", this.v);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.m = $$0.<ame>a("name", ame.a).orElse(b);
      this.q = $$0.<ame>a("target", ame.a).orElse(b);
      this.r = $$0.<amd<ewi>>a("pool", a).orElse(qx.a);
      this.t = $$0.a("final_state", "minecraft:air");
      this.s = $$0.<ecd.a>a("joint", ecd.a.c).orElseGet(() -> eza.a(this.m()));
      this.u = $$0.a("placement_priority", 0);
      this.v = $$0.a("selection_priority", 0);
   }

   public acw v() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public void a(aub $$0, int $$1, boolean $$2) {
      jb $$3 = this.aA_().a(this.m().c(duh.b).a());
      jy<ewi> $$4 = $$0.K_().f(mn.bk);
      jl<ewi> $$5 = $$4.b(this.r);
      ewc.a($$0, $$5, this.q, $$1, $$3, $$2);
   }

   public static enum a implements bda {
      a("rollable"),
      b("aligned");

      public static final bda.a<ecd.a> c = bda.a(ecd.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public xo a() {
         return xo.c("jigsaw_block.joint." + this.d);
      }
   }
}
