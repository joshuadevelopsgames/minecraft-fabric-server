import javax.annotation.Nullable;

public interface cbg {
   cbf a = ($$0, $$1, $$2) -> true;
   cbf b = ($$0, $$1, $$2) -> {
      if ($$2 != null && $$0.F_().a($$1)) {
         jb $$3 = $$1.d();
         return $$0.b_($$1).a(azu.a) && !$$0.a_($$3).d($$0, $$3);
      } else {
         return false;
      }
   };
   cbf c = ($$0, $$1, $$2) -> $$2 != null && $$0.F_().a($$1) ? $$0.b_($$1).a(azu.b) : false;
   cbf d = new cbf() {
      @Override
      public boolean isSpawnPositionOk(dmx $$0, jb $$1, @Nullable bzv<?> $$2) {
         if ($$2 != null && $$0.F_().a($$1)) {
            jb $$3 = $$1.d();
            jb $$4 = $$1.e();
            eeb $$5 = $$0.a_($$4);
            return !$$5.a($$0, $$4, $$2) ? false : this.a($$0, $$1, $$2) && this.a($$0, $$3, $$2);
         } else {
            return false;
         }
      }

      private boolean a(dmx $$0, jb $$1, bzv<?> $$2) {
         eeb $$3 = $$0.a_($$1);
         return dnf.a($$0, $$1, $$3, $$3.y(), $$2);
      }

      @Override
      public jb a(dmx $$0, jb $$1) {
         jb $$2 = $$1.e();
         return $$0.a_($$2).a(fba.a) ? $$2 : $$1;
      }
   };
}
