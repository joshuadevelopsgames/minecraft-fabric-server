import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class etw extends euf {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jb.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, etw::new)
   );
   private final List<jb> c;

   public static etw a(jb... $$0) {
      return new etw(List.of($$0));
   }

   private etw(List<jb> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jb> a_(eud $$0, bck $$1, jb $$2) {
      int $$3 = ke.a($$2.u());
      int $$4 = ke.a($$2.w());
      boolean $$5 = false;

      for (jb $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jb $$2) {
      return $$0 == ke.a($$2.u()) && $$1 == ke.a($$2.w());
   }

   @Override
   public eug<?> b() {
      return eug.o;
   }
}
