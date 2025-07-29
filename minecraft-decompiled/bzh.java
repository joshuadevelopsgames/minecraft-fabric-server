import java.util.Set;

public enum bzh {
   a(true) {
      @Override
      void a(cao $$0, cao $$1, bzg $$2) {
         bzm $$3 = $$0.db();
         $$1.x($$0);
         $$1.i($$0.dA());
         if ($$3 != null) {
            $$3.bS();
            $$3.W = 0;

            for (bzm $$4 : $$1.da()) {
               $$4.bS();
               $$4.a(bzm.e.b);
            }

            $$3.o($$1);
         }

         bzm $$5 = $$0.dm();
         if ($$5 != null) {
            $$0.bS();
            $$1.o($$5);
         }

         if ($$2.b()) {
            for (bzw $$6 : bzw.j) {
               dcv $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.go().b($$6));
               }
            }
         }

         $$1.am = $$0.am;
         $$1.b(7, $$0.fQ());
         $$1.bx = $$0.bx;
         $$1.bj = $$0.bj;
         $$1.br = $$0.br;
         $$1.e($$0.aK());
         $$0.fW().ifPresent($$1::g);
         bzm $$8 = $$0.aj_();
         if ($$8 != null) {
            $$1.a_($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(cao $$0, cao $$1, bzg $$2) {
         bzm $$3 = $$0.db();
         if ($$3 != null) {
            $$3.bS();
         }

         bzm $$4 = $$0.aj_();
         if ($$4 != null) {
            $$0.S_();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private static final Set<kp<?>> c = Set.of(kq.g, kq.b);
   private final boolean d;

   bzh(final boolean $$0) {
      this.d = $$0;
   }

   public boolean a() {
      return this.d;
   }

   abstract void a(cao var1, cao var2, bzg var3);

   void b(cao $$0, cao $$1, bzg $$2) {
      $$1.E($$0.fD());

      for (byq $$3 : $$0.eI()) {
         $$1.a(new byq($$3));
      }

      if ($$0.g_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bzc $$4 && $$1 instanceof bzc $$5) {
         $$5.c_($$4.Z_());
         $$5.e = $$4.e;
         $$5.f = $$4.f;
      }

      cbm<?> $$6 = $$0.eh();
      cbm<?> $$7 = $$1.eh();
      if ($$6.a(cjo.ac, cjp.c) && $$6.a(cjo.ac)) {
         $$7.a(cjo.ac, $$6.c(cjo.ac));
      }

      if ($$2.c()) {
         $$1.a_($$0.fU());
      }

      $$1.v($$0.gx());
      $$1.u($$0.gw());
      if ($$0.gq()) {
         $$1.gp();
      }

      $$1.p($$0.cP());
      $$1.d($$0.cb());
      $$1.n($$0.cG());
      $$1.g($$0.bf());
      $$1.f($$0.aC());
      $$1.f($$0.be());
      $$0.as().forEach($$1::a);

      for (kp<?> $$8 : c) {
         a($$0, $$1, $$8);
      }

      if ($$2.d() != null) {
         fjx $$9 = $$1.ai().S();
         $$9.a($$1.cL(), $$2.d());
         if ($$0.cu() != null && $$0.cu() == $$2.d()) {
            $$9.b($$0.cL(), $$0.cu());
         }
      }

      if ($$0 instanceof cso $$10 && $$10.gO() && $$1 instanceof cso $$11) {
         $$11.y(true);
      }
   }

   private static <T> void a(cao $$0, cao $$1, kp<T> $$2) {
      T $$3 = $$0.a($$2);
      if ($$3 != null) {
         $$1.d($$2, $$3);
      }
   }
}
