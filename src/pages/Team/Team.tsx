import { IonBackButton, IonContent, IonHeader, IonItem, IonPage, IonTitle, IonToolbar } from "@ionic/react";
import TeamList from "../../components/TeamList/TeamList";
import "./Team.sass";

const Team = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonItem slot="start">
            <IonBackButton defaultHref="/"></IonBackButton>
          </IonItem>
          <IonTitle>
            <div className="teams">Teams</div>
          </IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen className="ion-padding">
        <TeamList />
      </IonContent>
    </IonPage>
  );
};

const useData = () => {};

export default Team;
