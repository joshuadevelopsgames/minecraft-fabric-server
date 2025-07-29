import com.mojang.serialization.Dynamic;

public final class dmy {
   private final String a;
   private final dmr b;
   private final boolean c;
   private final bxg d;
   private final boolean e;
   private final dmq f;
   private final dns g;

   public dmy(String $$0, dmr $$1, boolean $$2, bxg $$3, boolean $$4, dmq $$5, dns $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dmy a(Dynamic<?> $$0, dns $$1) {
      dmr $$2 = dmr.a($$0.get("GameType").asInt(0));
      return new dmy(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bxg.a($$0x.byteValue())).result().orElse(bxg.c),
         $$0.get("allowCommands").asBoolean($$2 == dmr.b),
         new dmq($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dmr b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bxg d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dmq f() {
      return this.f;
   }

   public dns g() {
      return this.g;
   }

   public dmy a(dmr $$0) {
      return new dmy(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dmy a(bxg $$0) {
      return new dmy(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dmy a(dns $$0) {
      return new dmy(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dmy h() {
      return new dmy(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
