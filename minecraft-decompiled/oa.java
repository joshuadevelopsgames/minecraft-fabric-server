import java.util.function.BiConsumer;

public record oa(jn.a a) implements nr {
   @Override
   public void generate(BiConsumer<amd<fdo>, fdo.a> $$0) {
      jn.b<dlk> $$1 = this.a.e(mn.bq);
      jn.b<dli> $$2 = this.a.e(mn.bp);
      jn.b<dji> $$3 = this.a.e(mn.aW);
      dlg $$4 = new dlg($$2.b(dlj.e), $$1.b(dll.q));
      dlg $$5 = new dlg($$2.b(dlj.e), $$1.b(dll.r));
      $$0.accept(
         fdf.ai,
         fdo.b()
            .a(
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(fec.a(a(dcz.qH, dcz.qI, $$5, $$3).b()).a(4))
                  .a(fec.a(a(dcz.qL, dcz.qM, $$4, $$3).b()).a(2))
                  .a(fec.a(a(dcz.qP, dcz.qQ, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         fdf.ak,
         fdo.b()
            .a(fdn.a().a(fhl.a(1.0F)).a(fec.a(fdf.ai)))
            .a(
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(fdw.a(dcz.qg).a(4))
                  .a(fdw.a(dcz.qg).a(new ffk.a().a($$3.b(djn.n), fhl.a(1.0F))))
                  .a(fdw.a(dcz.qg).a(new ffk.a().a($$3.b(djn.q), fhl.a(1.0F))))
                  .a(fdw.a(dcz.ql))
            )
      );
      $$0.accept(
         fdf.aj,
         fdo.b()
            .a(fdn.a().a(fhl.a(1.0F)).a(fec.a(fdf.ai)))
            .a(
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(fdw.a(dcz.pA).a(2))
                  .a(fdw.a(dcz.pA).a(new ffk.a().a($$3.b(djn.y), fhl.a(1.0F))))
                  .a(fdw.a(dcz.pA).a(new ffk.a().a($$3.b(djn.z), fhl.a(1.0F))))
            )
      );
   }

   public static fdo.a a(dcr $$0, dcr $$1, dlg $$2, jn.b<dji> $$3) {
      return fdo.b()
         .a(
            fdn.a()
               .a(fhl.a(1.0F))
               .a(fgx.a(0.5F))
               .a(fdw.a($$0).a(fff.a(kq.W, $$2)).a(new ffk.a().a($$3.b(djn.a), fhl.a(4.0F)).a($$3.b(djn.e), fhl.a(4.0F)).a($$3.b(djn.b), fhl.a(4.0F))))
         )
         .a(
            fdn.a()
               .a(fhl.a(1.0F))
               .a(fgx.a(0.5F))
               .a(fdw.a($$1).a(fff.a(kq.W, $$2)).a(new ffk.a().a($$3.b(djn.a), fhl.a(4.0F)).a($$3.b(djn.e), fhl.a(4.0F)).a($$3.b(djn.b), fhl.a(4.0F))))
         );
   }
}
