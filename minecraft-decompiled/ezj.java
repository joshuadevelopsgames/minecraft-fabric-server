import com.mojang.serialization.MapCodec;

public interface ezj<P extends ezi> {
   ezj<ezg> a = a("clear", ezg.a);
   ezj<ezh> b = a("passthrough", ezh.b);
   ezj<ezf> c = a("append_static", ezf.a);
   ezj<eze> d = a("append_loot", eze.a);

   MapCodec<P> codec();

   private static <P extends ezi> ezj<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.n, $$0, () -> $$1);
   }
}
