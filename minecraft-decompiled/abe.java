import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface abe {
   abe.b<? extends abe> a();

   static <B extends ByteBuf, T extends abe> zm<B, T> a(zp<B, T> $$0, zn<B, T> $$1) {
      return zm.a($$0, $$1);
   }

   static <T extends abe> abe.b<T> a(String $$0) {
      return new abe.b<>(ame.b($$0));
   }

   static <B extends wg> zm<B, abe> a(final abe.a<B> $$0, List<abe.c<? super B, ?>> $$1) {
      final Map<ame, zm<? super B, ? extends abe>> $$2 = $$1.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a().a(), abe.c::b));
      return new zm<B, abe>() {
         private zm<? super B, ? extends abe> a(ame $$0x) {
            zm<? super B, ? extends abe> $$1x = $$2.get($$0);
            return $$1x != null ? $$1x : $$0.create($$0);
         }

         private <T extends abe> void a(B $$0x, abe.b<T> $$1x, abe $$2x) {
            $$0.a($$1x.a());
            zm<B, T> $$3 = this.a($$1x.a);
            $$3.encode($$0, (T)$$2);
         }

         public void a(B $$0x, abe $$1x) {
            this.a($$0, $$1x.a(), $$1x);
         }

         public abe a(B $$0x) {
            ame $$1x = $$0.q();
            return (abe)this.a($$1x).decode($$0);
         }
      };
   }

   public interface a<B extends wg> {
      zm<B, ? extends abe> create(ame var1);
   }

   public record b<T extends abe>(ame a) {
   }

   public record c<B extends wg, T extends abe>(abe.b<T> a, zm<B, T> b) {
   }
}
