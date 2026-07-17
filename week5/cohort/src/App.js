import logo from './logo.svg';
import styles from './CohortDetails.module.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 

function App() {
 
  return (
    <div>
      <h1>Cohorts Details</h1>
  <div className={styles.container}>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
  </div>
  </div>
  );
}

export default App;
