public abstract class crc extends cwk {
   protected crc(bzv<? extends crc> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
   }

   public crc.a l() {
      return crc.a.a;
   }

   @Override
   public boolean c(cam $$0) {
      return $$0 instanceof cua && $$0.g_() ? false : super.c($$0);
   }

   @Override
   protected boolean u(bzm $$0) {
      if (super.u($$0)) {
         return true;
      } else {
         return !$$0.ap().a(azs.z) ? false : this.cu() == null && $$0.cu() == null;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }

   protected class b extends cia {
      public b(final cwk $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && crc.this.gX();
      }
   }
}
