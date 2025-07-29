public enum efc implements bda {
   a("harp", ayz.tk, efc.a.a),
   b("basedrum", ayz.te, efc.a.a),
   c("snare", ayz.tn, efc.a.a),
   d("hat", ayz.tl, efc.a.a),
   e("bass", ayz.tf, efc.a.a),
   f("flute", ayz.ti, efc.a.a),
   g("bell", ayz.tg, efc.a.a),
   h("guitar", ayz.tj, efc.a.a),
   i("chime", ayz.th, efc.a.a),
   j("xylophone", ayz.to, efc.a.a),
   k("iron_xylophone", ayz.tp, efc.a.a),
   l("cow_bell", ayz.tq, efc.a.a),
   m("didgeridoo", ayz.tr, efc.a.a),
   n("bit", ayz.ts, efc.a.a),
   o("banjo", ayz.tt, efc.a.a),
   p("pling", ayz.tm, efc.a.a),
   q("zombie", ayz.tu, efc.a.b),
   r("skeleton", ayz.tv, efc.a.b),
   s("creeper", ayz.tw, efc.a.b),
   t("dragon", ayz.tx, efc.a.b),
   u("wither_skeleton", ayz.ty, efc.a.b),
   v("piglin", ayz.tz, efc.a.b),
   w("custom_head", ayz.BU, efc.a.c);

   private final String x;
   private final jl<ayy> y;
   private final efc.a z;

   private efc(final String $$0, final jl<ayy> $$1, final efc.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jl<ayy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == efc.a.a;
   }

   public boolean d() {
      return this.z == efc.a.c;
   }

   public boolean e() {
      return this.z != efc.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
