import com.google.common.collect.ImmutableList;

public interface gbt {
   default void a(gbs $$0, xo $$1) {
      this.a($$0, gbv.a($$1.getString()));
   }

   default void a(gbs $$0, String $$1) {
      this.a($$0, gbv.a($$1));
   }

   default void a(gbs $$0, xo... $$1) {
      this.a($$0, gbv.a(ImmutableList.copyOf($$1)));
   }

   void a(gbs var1, gbv<?> var2);

   gbt a();
}
