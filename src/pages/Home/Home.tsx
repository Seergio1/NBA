import { IonContent, IonPage } from "@ionic/react";
import "./Home.sass";
import SplashScreen from "../../components/SplashScreen/SplashScreen";
import { useEffect } from "react";

const Home: React.FC = () => {
  useEffect(() => {});
  return (
    <IonPage>
      <IonContent fullscreen className="ion-padding">
        <SplashScreen />
      </IonContent>
    </IonPage>
  );
};

export default Home;
