import Lenis from "@studio-freight/lenis";
import "./reset.scss";
import JoueurCard from "./components/joueur-card/JoueurCard";

function App() {
  const lenis = new Lenis();

  function raf(time) {
    lenis.raf(time);
    requestAnimationFrame(raf);
  }

  requestAnimationFrame(raf);

  const stats = [
    {
      classement: 1,
      joueur: {
        nom: "Stephen",
        prenom: "Curry",
        photo: "./curry.jpg",
      },
      equipe: "GSW",
      match: "12",
      matchJoues: "12",
      pointParMatch: "45.2",
      rebondParMatch: "3.4",
      passeDecisiveParMatch: "12.3",
      minuteParMatch: "35.2",
      troisPointMoyenne: "68",
      lancerFrancMoyenne: "80",
    },
  ];

  return <JoueurCard stat={stats[0]} />;
}

export default App;
