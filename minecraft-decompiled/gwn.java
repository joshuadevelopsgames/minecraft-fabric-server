import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gwn implements bvf {
   private final gxh a;
   private final Set<bvd> b = new ObjectOpenHashSet();
   private final bvl c = new bvl();

   public gwn(LongSupplier $$0, gxh $$1) {
      this.a = $$1;
      this.b.add(bvm.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bvm.a());
      this.b.add(bvd.a("totalChunks", bvc.f, this.a, gxh::g));
      this.b.add(bvd.a("renderedChunks", bvc.f, this.a, gxh::i));
      this.b.add(bvd.a("lastViewDistance", bvc.f, this.a, gxh::h));
      hbl $$0 = this.a.f();
      this.b.add(bvd.a("toUpload", bvc.g, $$0, hbl::g));
      this.b.add(bvd.a("freeBufferCount", bvc.g, $$0, hbl::h));
      this.b.add(bvd.a("compileQueueSize", bvc.g, $$0, hbl::f));
      if (fnw.a().isPresent()) {
         this.b.add(bvd.a("gpuUtilization", bvc.i, fue.R(), fue::v));
      }
   }

   @Override
   public Set<bvd> a(Supplier<btq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
