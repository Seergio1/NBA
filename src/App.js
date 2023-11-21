import Lenis from "@studio-freight/lenis";
import "./reset.scss";
import JoueurPage from "./pages/JoueurPage";

function App() {
  const lenis = new Lenis();

  function raf(time) {
    lenis.raf(time);
    requestAnimationFrame(raf);
  }

  requestAnimationFrame(raf);

  return <JoueurPage />;
}

export default App;
