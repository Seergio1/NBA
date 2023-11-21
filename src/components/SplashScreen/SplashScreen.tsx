import React from "react";
import "./SplashScreen.sass";
import { IonButton } from "@ionic/react";
import useNav from "../../hooks/useNav";
import LogoNBA from "../../assets/svg/LogoNBA";

const SplashScreen: React.FC = () => {
  const { to } = useNav();
  return (
    <div className="container_splashScreen">
      <div className="splashIcon">
        <LogoNBA />
      </div>
      <div className="title"> Statistics </div>
      <div className="subtitlte">
        Score, Stats, Slam! Elevate Your NBA Experience with Real-Time Statistics at Your Fingertips.
      </div>
      <IonButton
        className="button"
        onClick={() => {
          to("/teams");
        }}
      >
        Look Teams
      </IonButton>
    </div>
  );
};

export default SplashScreen;
