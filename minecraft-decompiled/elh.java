import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface elh extends BiPredicate<dnt, jb> {
   Codec<elh> b = mm.M.q().dispatch(elh::a, eli::codec);
   elh c = a(dqb.a);
   elh d = a(dqb.a, dqb.J);

   eli<?> a();

   static elh a(List<elh> $$0) {
      return new elf($$0);
   }

   static elh a(elh... $$0) {
      return a(List.of($$0));
   }

   static elh a(elh $$0, elh $$1) {
      return a(List.of($$0, $$1));
   }

   static elh b(List<elh> $$0) {
      return new elg($$0);
   }

   static elh b(elh... $$0) {
      return b(List.of($$0));
   }

   static elh b(elh $$0, elh $$1) {
      return b(List.of($$0, $$1));
   }

   static elh a(kg $$0, List<dpz> $$1) {
      return new eln($$0, jp.a(dpz::p, $$1));
   }

   static elh c(List<dpz> $$0) {
      return a(kg.i, $$0);
   }

   static elh a(kg $$0, dpz... $$1) {
      return a($$0, List.of($$1));
   }

   static elh a(dpz... $$0) {
      return a(kg.i, $$0);
   }

   static elh a(kg $$0, bae<dpz> $$1) {
      return new elm($$0, $$1);
   }

   static elh a(bae<dpz> $$0) {
      return a(kg.i, $$0);
   }

   static elh b(kg $$0, List<fak> $$1) {
      return new elo($$0, jp.a(fak::k, $$1));
   }

   static elh a(kg $$0, fak... $$1) {
      return b($$0, List.of($$1));
   }

   static elh a(fak... $$0) {
      return a(kg.i, $$0);
   }

   static elh a(elh $$0) {
      return new elp($$0);
   }

   static elh a(kg $$0) {
      return new elq($$0);
   }

   static elh b() {
      return a(kg.i);
   }

   static elh a(eeb $$0, kg $$1) {
      return new elv($$1, $$0);
   }

   static elh a(kg $$0, jh $$1) {
      return new elk($$0, $$1);
   }

   static elh a(jh $$0) {
      return a(kg.i, $$0);
   }

   static elh b(kg $$0) {
      return new elr($$0);
   }

   static elh c() {
      return b(kg.i);
   }

   static elh d() {
      return c(kg.i);
   }

   static elh c(kg $$0) {
      return a($$0, fam.a);
   }

   static elh d(kg $$0) {
      return new ell($$0);
   }

   static elh e() {
      return elt.a;
   }

   static elh e(kg $$0) {
      return new elu($$0);
   }

   static elh f() {
      return e(kg.i);
   }
}
