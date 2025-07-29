import java.util.Locale;

public interface evp {
   evp a = a(exc.a::new, "MSCorridor");
   evp b = a(exc.b::new, "MSCrossing");
   evp c = a(exc.d::new, "MSRoom");
   evp d = a(exc.e::new, "MSStairs");
   evp e = a(exe.a::new, "NeBCr");
   evp f = a(exe.b::new, "NeBEF");
   evp g = a(exe.c::new, "NeBS");
   evp h = a(exe.d::new, "NeCCS");
   evp i = a(exe.e::new, "NeCTB");
   evp j = a(exe.f::new, "NeCE");
   evp k = a(exe.g::new, "NeSCSC");
   evp l = a(exe.h::new, "NeSCLT");
   evp m = a(exe.i::new, "NeSC");
   evp n = a(exe.j::new, "NeSCRT");
   evp o = a(exe.k::new, "NeCSR");
   evp p = a(exe.l::new, "NeMT");
   evp q = a(exe.o::new, "NeRC");
   evp r = a(exe.p::new, "NeSR");
   evp s = a(exe.q::new, "NeStart");
   evp t = a(exq.a::new, "SHCC");
   evp u = a(exq.b::new, "SHFC");
   evp v = a(exq.c::new, "SH5C");
   evp w = a(exq.d::new, "SHLT");
   evp x = a(exq.e::new, "SHLi");
   evp y = a(exq.g::new, "SHPR");
   evp z = a(exq.h::new, "SHPH");
   evp A = a(exq.i::new, "SHRT");
   evp B = a(exq.j::new, "SHRC");
   evp C = a(exq.l::new, "SHSD");
   evp D = a(exq.m::new, "SHStart");
   evp E = a(exq.n::new, "SHS");
   evp F = a(exq.o::new, "SHSSD");
   evp G = a(exa::new, "TeJP");
   evp H = a(exk.a::a, "ORP");
   evp I = a(ewx.a::new, "Iglu");
   evp J = a(exm::new, "RUPO");
   evp K = a(exs::new, "TeSH");
   evp L = a(ewt::new, "TeDP");
   evp M = a(exi.h::new, "OMB");
   evp N = a(exi.j::new, "OMCR");
   evp O = a(exi.k::new, "OMDXR");
   evp P = a(exi.l::new, "OMDXYR");
   evp Q = a(exi.m::new, "OMDYR");
   evp R = a(exi.n::new, "OMDYZR");
   evp S = a(exi.o::new, "OMDZR");
   evp T = a(exi.p::new, "OMEntry");
   evp U = a(exi.q::new, "OMPenthouse");
   evp V = a(exi.s::new, "OMSimple");
   evp W = a(exi.t::new, "OMSimpleT");
   evp X = a(exi.u::new, "OMWR");
   evp Y = a(ewv.a::new, "ECP");
   evp Z = a(exu.i::new, "WMP");
   evp aa = a(ewr.a::new, "BTP");
   evp ab = a(exo.a::new, "Shipwreck");
   evp ac = a(exg.a::new, "NeFos");
   evp ad = a(euu::new, "jigsaw");

   evc load(evo var1, ui var2);

   private static evp a(evp $$0, String $$1) {
      return jy.a(mm.Q, $$1.toLowerCase(Locale.ROOT), $$0);
   }

   private static evp a(evp.a $$0, String $$1) {
      return a((evp)$$0, $$1);
   }

   private static evp a(evp.b $$0, String $$1) {
      return a((evp)$$0, $$1);
   }

   public interface a extends evp {
      evc load(ui var1);

      @Override
      default evc load(evo $$0, ui $$1) {
         return this.load($$1);
      }
   }

   public interface b extends evp {
      evc load(ezb var1, ui var2);

      @Override
      default evc load(evo $$0, ui $$1) {
         return this.load($$0.c(), $$1);
      }
   }
}
