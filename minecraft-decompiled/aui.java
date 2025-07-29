public record aui(long j, boolean k, aui.a l) {
   public static final long a = 0L;
   public static final aui b = a("start", 0L, false, aui.a.c);
   public static final aui c = a("dragon", 0L, false, aui.a.c);
   public static final aui d = a("player_loading", 0L, false, aui.a.a);
   public static final aui e = a("player_simulation", 0L, false, aui.a.b);
   public static final aui f = a("forced", 0L, true, aui.a.c);
   public static final aui g = a("portal", 300L, true, aui.a.c);
   public static final aui h = a("ender_pearl", 40L, false, aui.a.c);
   public static final aui i = a("unknown", 1L, false, aui.a.a);

   private static aui a(String $$0, long $$1, boolean $$2, aui.a $$3) {
      return jy.a(mm.aA, $$0, new aui($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == aui.a.a || this.l == aui.a.c;
   }

   public boolean b() {
      return this.l == aui.a.b || this.l == aui.a.c;
   }

   public boolean c() {
      return this.j != 0L;
   }

   public long d() {
      return this.j;
   }

   public boolean e() {
      return this.k;
   }

   public aui.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
